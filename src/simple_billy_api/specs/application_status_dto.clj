(ns simple-billy-api.specs.application-status-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def application-status-dto-data
  {
   (ds/opt :postingId) uuid?
   (ds/req :status) string?
   })

(def application-status-dto-spec
  (ds/spec
    {:name ::application-status-dto
     :spec application-status-dto-data}))
