(ns simple-billy-api.specs.vat-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.vat-item :refer :all]
            [simple-billy-api.specs.vat-item :refer :all]
            )
  (:import (java.io File)))


(def vat-summary-data
  {
   (ds/req :input_tax_items) (s/coll-of vat-item-spec)
   (ds/req :output_tax_items) (s/coll-of vat-item-spec)
   (ds/req :total_input_tax) string?
   (ds/req :total_output_tax) string?
   (ds/req :vat_due) string?
   })

(def vat-summary-spec
  (ds/spec
    {:name ::vat-summary
     :spec vat-summary-data}))
