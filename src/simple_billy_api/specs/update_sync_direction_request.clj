(ns simple-billy-api.specs.update-sync-direction-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-sync-direction-request-data
  {
   (ds/req :directions) (s/map-of string? string?)
   })

(def update-sync-direction-request-spec
  (ds/spec
    {:name ::update-sync-direction-request
     :spec update-sync-direction-request-data}))
