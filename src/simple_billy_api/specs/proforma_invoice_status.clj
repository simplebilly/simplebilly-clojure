(ns simple-billy-api.specs.proforma-invoice-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def proforma-invoice-status-data
  {
   })

(def proforma-invoice-status-spec
  (ds/spec
    {:name ::proforma-invoice-status
     :spec proforma-invoice-status-data}))
