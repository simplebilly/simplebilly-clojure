(ns simple-billy-api.specs.vat-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vat-detail-data
  {
   (ds/req :count) int?
   (ds/req :net_amount) string?
   (ds/req :tax_amount) string?
   (ds/req :tax_rate) string?
   })

(def vat-detail-spec
  (ds/spec
    {:name ::vat-detail
     :spec vat-detail-data}))
