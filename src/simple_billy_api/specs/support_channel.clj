(ns simple-billy-api.specs.support-channel
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.support-channel-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def support-channel-data
  {
   (ds/req :channelType) support-channel-type-spec
   (ds/req :config) any-type-spec
   (ds/req :createdAt) inst?
   (ds/req :isActive) boolean?
   (ds/req :name) string?
   (ds/req :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def support-channel-spec
  (ds/spec
    {:name ::support-channel
     :spec support-channel-data}))
