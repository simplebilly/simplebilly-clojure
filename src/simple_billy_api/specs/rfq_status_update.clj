(ns simple-billy-api.specs.rfq-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def rfq-status-update-data
  {
   (ds/req :status) string?
   })

(def rfq-status-update-spec
  (ds/spec
    {:name ::rfq-status-update
     :spec rfq-status-update-data}))
