(ns simple-billy-api.specs.bwa-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bwa-summary-data
  {
   (ds/req :gross_profit) string?
   (ds/req :net_profit) string?
   (ds/req :open_invoices_count) int?
   (ds/req :open_invoices_total) string?
   (ds/req :overdue_invoices_count) int?
   (ds/req :overdue_invoices_total) string?
   (ds/req :profit_margin) float?
   })

(def bwa-summary-spec
  (ds/spec
    {:name ::bwa-summary
     :spec bwa-summary-data}))
