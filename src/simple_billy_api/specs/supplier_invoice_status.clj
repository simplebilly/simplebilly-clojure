(ns simple-billy-api.specs.supplier-invoice-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def supplier-invoice-status-data
  {
   })

(def supplier-invoice-status-spec
  (ds/spec
    {:name ::supplier-invoice-status
     :spec supplier-invoice-status-data}))
