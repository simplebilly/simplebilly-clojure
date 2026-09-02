(ns simple-billy-api.specs.sales-volume-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sales-volume-item-data
  {
   (ds/req :contact_id) string?
   (ds/req :contact_type) string?
   (ds/opt :last_purchase_date) string?
   (ds/req :name) string?
   (ds/req :total_invoices) int?
   (ds/req :total_revenue) string?
   })

(def sales-volume-item-spec
  (ds/spec
    {:name ::sales-volume-item
     :spec sales-volume-item-data}))
