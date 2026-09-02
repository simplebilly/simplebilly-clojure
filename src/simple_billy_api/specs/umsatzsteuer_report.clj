(ns simple-billy-api.specs.umsatzsteuer-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.vat-detail :refer :all]
            [simple-billy-api.specs.vat-detail :refer :all]
            )
  (:import (java.io File)))


(def umsatzsteuer-report-data
  {
   (ds/req :generated_at) string?
   (ds/req :input_tax) (s/coll-of vat-detail-spec)
   (ds/req :output_tax) (s/coll-of vat-detail-spec)
   (ds/req :period) string?
   (ds/req :total_input_tax) string?
   (ds/req :total_output_tax) string?
   (ds/req :vat_payable) string?
   (ds/req :vat_refund) string?
   })

(def umsatzsteuer-report-spec
  (ds/spec
    {:name ::umsatzsteuer-report
     :spec umsatzsteuer-report-data}))
